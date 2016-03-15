print("MinimumExampleExtended...")

minimumPCM = read.csv2("PalladioResults/result_8000.csv", header=F, dec=".")
minimumEmotions = read.csv2("MaudeResults/result_8000tu.txt", header=F, dec=".")
ks.test(minimumPCM[,1], minimumEmotions[,1])

png('outMinimumExampleExtended.png')
plot(ecdf(minimumPCM[,1]), main="", xlab="", ylab="")
par(new=TRUE)
plot(ecdf(minimumEmotions[,1]), main="", xlab="", ylab="", col="blue")
title(main="MinimumExample", sub="e-Motions in blue",
	xlab="ResponseTime", ylab="CDF")


