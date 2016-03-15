# mean and st of Response time

import sys
import numpy as np

def descriptive_analysis(list):
    print(" -- Descriptive analysis") 
    print("  #elements: {}".format(len(list)))
    print("  mean:      {}".format(np.mean(list)))
    print("  sd:        {}".format(np.std(list)))
    print("  max:       {}".format(np.max(list)))
    print("  min:       {}".format(np.min(list)))

if __name__ == '__main__':
    if(len(sys.argv) != 2):
        raise Exception('Incorrect number of args! use: <filename> '+\
            'maudefilename')
    # correct number of args.
    with open(sys.argv[1]) as fEmotions:
       whole_file=fEmotions.read()
       # crop allRT
       whole_file = whole_file[whole_file.find("allRT@ObResponseTime@pcmflatten"):]
       # crop starting of the Sequence
       whole_file = whole_file[whole_file.find("{")+1:]
       # crop ending of the Sequence
       whole_file = whole_file[:whole_file.find("}")]
       # cleaning it up!
       whole_file = whole_file.replace("\n", "")
       whole_file = whole_file.replace(" ", "")
       # list of values
       list_emotions_str = whole_file.split('#')
       list_emotions_values = []
       for pair in list_emotions_str:
           if [pair] == pair.split('/'):
               list_emotions_values.extend([float(str(pair))])
           else:
               aux_tuple = pair.split('/')
               list_emotions_values.extend([float(str(aux_tuple[0]))/float(str(aux_tuple[1]))])

       descriptive_analysis(list_emotions_values)
