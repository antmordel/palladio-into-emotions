#!/bin/bash
sed -e 's/\#/\'$'\n/g' -e 's/\}//g' $1 > "temp";
sed -e 's/^[ \t]*//' -e 's/[ \t]*$//' -e '/^\s*$/d' "temp" > $1;
rm "temp";
echo 'done (:'
