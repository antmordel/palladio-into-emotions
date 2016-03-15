#!/bin/bash

# @author: Antonio Moreno. Script to run all available tests.

MAUDE=maude

function evaluation() {
    echo -n " - Running $2 time units...";
    $MAUDE $1"eval"$2"tu.maude" &> $1"results"$2"tu.outputmaude"
    echo -e "\r - Results for $2 time units...";

    sed -n -e '/ObResponseTime@pcmflatten/,/\} \>/p' $1"results"$2"tu.outputmaude" > \
      $1"cleaned"$2"tu.outputmaude" ;

    python3 global_files/scripts/execution_times.py $1"results"$2"tu.outputmaude";
    python3 global_files/scripts/descriptive_anal.py $1"cleaned"$2"tu.outputmaude";

    rm $1"cleaned"$2"tu.outputmaude" $1"results"$2"tu.outputmaude";
    echo "";
}

function run_eval() {
    for i in "${@:2}"
    do
        evaluation $1 $i
    done
}

function banner() {
    echo "-----------------------------------------------------------";
    echo "---- $1";
    echo "-----------------------------------------------------------";
}

echo "===========================================================";
echo "---- EVALUATION OPTIMIZED CODE";
echo -e "===========================================================\n";

#banner "MINIMUM EXAMPLE"
#run_eval optimized/minimum_example/ 10 50 100 500 1500 3000
#
#banner "EXTERNAL CALLS"
#run_eval optimized/external_calls/ 10 50 500 2000

banner "LOOPS"
run_eval optimized/loops/ 400

echo "===========================================================";
echo "---- EVALUATION EMOTIONS OUTPUTS";
echo -e "===========================================================\n";

#banner "MINIMUM EXAMPLE"
#run_eval eMotions_outs/minimum_example/ 10 50 100 500 1500 3000
#
#banner "EXTERNAL CALLS"
#run_eval eMotions_outs/external_calls/ 10 50 500 2000

#banner "LOOPS"
#run_eval eMotions_outs/loops/ 80 400 2000
