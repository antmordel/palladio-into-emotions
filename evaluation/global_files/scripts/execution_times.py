
# execution data

import sys

if __name__ == '__main__':
    if(len(sys.argv) != 2):
        raise Exception('Incorrect number of args! use: <filename> '+\
            'maudefilename')
    # correct number of args.
    with open(sys.argv[1]) as fEmotions:
       whole_file=fEmotions.read()
       # crop up to rewrites number
       whole_file = whole_file[whole_file.find("rewrites:"):]
       whole_file = whole_file[:whole_file.find("\n")]
       rewrites = whole_file[(whole_file.find(":")+2):whole_file.find(" ",
           whole_file.find(":")+2)]
       time = whole_file[whole_file.find("(")+1:whole_file.find(")")-4]
       print(" -- Execution stats") 
       print("  #rewrites: {}".format(rewrites))
       print("  cpu time:  {}".format(time))
