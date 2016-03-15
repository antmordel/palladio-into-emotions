#!/bin/bash
if [ "$#" -ne 1 ]; then
	echo 'error: please enter the correct number of args';
else
	sed -e 's/.*\..*\;//g' $1 > "temporalfile.tmp";
	tail -n +2 "temporalfile.tmp" > $1;
fi
