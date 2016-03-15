print("MinimumExample with DoublePDF and OpenWorkload = 2")

minimumPCM = read.csv2("PalladioResults/MinimumExample_DoublePDF_2_4000.csv", header=F, dec=".")
minimumEmotions = read.csv2("MaudeResults/result_4000tu_DoublePDF_ow_2.txt", header=F, dec=".")
ks.test(minimumPCM[,1], minimumEmotions[,1])

png('outME_DoublePDF_ow_2.png')
plot(ecdf(minimumPCM[,1]), main="", xlab="", ylab="")
par(new=TRUE)
plot(ecdf(minimumEmotions[,1]), main="", xlab="", ylab="", col="blue")
title(main="MinimumExample", sub="e-Motions in blue",
	xlab="ResponseTime", ylab="CDF")


