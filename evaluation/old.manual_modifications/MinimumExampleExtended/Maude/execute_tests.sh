#!/bin/bash 

MAUDE="maude"
LOAD_EMOTIONS="../GlobalFiles/mOdCL.maude model-checker.maude ../GlobalFiles/MGDefinitions.maude ../GlobalFiles/MGRealTimeMaude24.maude ../GlobalFiles/EcoreMM.maude ../GlobalFiles/e-Motions.maude ../GlobalFiles/flatten.ecore.maude ../GlobalFiles/PalladioGrammar.maude ../GlobalFiles/ManualChangesRulesPalladio_v5.maude"
EXAMPLE="MinimumExampleExtended.xmi.maude"

echo "--------------------------" 
echo "MinimumExampleExtended" 
echo "--------------------------"

T="$(date +%s)"

echo "-- MinimumExampleExtended 2000 t.u."
if [ -a result_2000tu.txt ]
then       	
	rm result_2000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_2000tu.maude &> result_2000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- MinimumExampleExtended 4000 t.u."
if [ -a result_4000tu.txt ]
then        
  rm result_4000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_4000tu.maude &> result_4000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"

T="$(date +%s)"

echo "-- MinimumExampleExtended 8000 t.u."
if [ -a result_8000tu.txt ]
then        
  rm result_8000tu.txt
fi
$MAUDE $LOAD_EMOTIONS $EXAMPLE TickModule_8000tu.maude &> result_8000tu.txt

T="$(($(date +%s)-T))"
echo "Time in seconds: ${T}"
