#!/bin/bash 

MAUDE="maude100"
LOAD_EMOTIONS="../GlobalFiles/mOdCL.maude model-checker.maude ../GlobalFiles/MGDefinitions.maude ../GlobalFiles/MGRealTimeMaude24.maude ../GlobalFiles/EcoreMM.maude ../GlobalFiles/e-Motions.maude ../GlobalFiles/flatten.ecore.maude ../GlobalFiles/PalladioGrammar.maude ../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="BranchesUMParameters.xmi.maude"

echo "--------------------------" 
echo "BranchesUMParameters" 
echo "--------------------------"

T="$(date +%s)"

echo "-- BranchesUMParameters 1000 t.u."
if [ -a result_1000tu.txt ]
then       	
	rm result_1000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_1000tu.maude &> result_1000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- BranchesUMParameters 2000 t.u."
if [ -a result_2000tu.txt ]
then        
  rm result_2000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_2000tu.maude &> result_2000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- BranchesUMParameters 4000 t.u."
if [ -a result_4000tu.txt ]
then        
  rm result_4000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_4000tu.maude &> result_4000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- BranchesUMParameters 8000 t.u."
if [ -a result_8000tu.txt ]
then        
  rm result_8000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_8000tu.maude &> result_8000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- BranchesUMParameters 16000 t.u."
if [ -a result_16000tu.txt ]
then        
  rm result_16000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_16000tu.maude &> result_16000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"
