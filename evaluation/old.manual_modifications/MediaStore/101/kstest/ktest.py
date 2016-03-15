
from scipy.stats import ks_2samp
import numpy as np
import sys
import matplotlib.pyplot as plt
import statistics as st
from sklearn.preprocessing import normalize

#x = np.random.normal(0,1,1000)
#y = np.random.normal(0,1,1000)
#z = np.random.normal(1.1,0.9, 1000)

#print ks_2samp(x, y)
#print ks_2samp(x, z)

if(len(sys.argv) < 3):
	print('ERROR: incorrect number of arguments')
else:
	print '--> Reading file ', sys.argv[1]
	with open(sys.argv[1]) as fEmotions:
		emotions_results = [float(e) for e in fEmotions.readlines()]
		#print(emotions_results)
	print '--> Reading file ', sys.argv[2]
	with open(sys.argv[2]) as fPCM:
		pcm_results = [float(e) for e in fPCM.readlines()]
		#print(pcm_results)
	
	# are of the same length both lists?
	#if(len(emotions_results) != len(pcm_results)):
	#	if(len(emotions_results) < len(pcm_results)):
	#		pcm_results = pcm_results[:-(len(pcm_results)-len(emotions_results))]
	#	else:
	#		emotions_results = emotions_results[:-(len(emotions_results)-len(pcm_results))]
	
	# some data
	print 'size of the sample'
	print '  # size:   ', len(emotions_results)
	print 'e-Motions data analysis:'
	print '  # mean:   ', st.mean(emotions_results)
	print '  # st dev: ', st.pstdev(emotions_results)
	
	print 'PCM data analysis:'
	print '  # mean:   ', st.mean(pcm_results)
	print '  # st dev: ', st.pstdev(pcm_results)

	# calling to the test
	test_result = ks_2samp(emotions_results, pcm_results)
	print test_result

        #emotions_bins = np.arange(np.floor(min(emotions_results)),np.ceil(max(emotions_results)))
	#emotions_counts, emotions_bin_edges = np.histogram(emotions_results, bins=emotions_bins, normed=True)
        emotions_bins = 20
        emotions_counts, emotions_bin_edges = np.histogram(emotions_results, bins=emotions_bins, normed=True)
	emotions_cdf = np.cumsum(emotions_counts)
        print emotions_cdf
        print emotions_cdf / np.max(np.max(emotions_cdf), axis=0)
        emotions_cdf /= np.max(np.abs(emotions_cdf), axis=0)
        
        plt.plot(emotions_bin_edges[1:], emotions_cdf, label='e-Motions CDF')

	#pcm_bins = np.arange(np.floor(min(pcm_results)),np.ceil(max(pcm_results)))
        pcm_bins = 20
	pcm_counts, pcm_bin_edges = np.histogram(pcm_results, bins=pcm_bins, normed=True)
	pcm_cdf = np.cumsum(pcm_counts)
        pcm_cdf /= np.max(np.abs(pcm_cdf), axis=0)

	plt.plot(pcm_bin_edges[1:], pcm_cdf, label='PCM CDF')
	
	plt.legend()
	
	plt.show()

	# represent data
	sorted_emotions_data = np.array(emotions_results)
	y_values = np.array(range(0, len(emotions_results)))
	plt.plot(y_values, sorted_emotions_data, label='e-Motions data')

	sorted_palladio_data = np.array(pcm_results)
	y_values_pcm = np.array(range(0, len(pcm_results)))
	plt.plot(y_values_pcm, sorted_palladio_data, label='PCM data')
	
	plt.legend()
	plt.show()



