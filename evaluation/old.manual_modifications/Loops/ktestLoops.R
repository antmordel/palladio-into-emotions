print("Loops")

minimumPCM = read.csv2("PalladioResults/result_4000.csv", header=F, dec=".")
minimumEmotions = read.csv2("MaudeResults/result_4000tu.txt", header=F, dec=".")

lenPCM <- length(minimumPCM[,1])
lenEmotions <- length(minimumEmotions[,1])

lenPCM
lenEmotions

ks.test(minimumPCM[,1], minimumEmotions[,1])


png('outLoops.png')
plot(ecdf(minimumPCM[,1]), main="", xlab="", ylab="")
par(new=TRUE)
plot(ecdf(minimumEmotions[,1]), main="", xlab="", ylab="", col="blue")
title(main="Loops", sub="e-Motions in blue",
	xlab="ResponseTime", ylab="CDF")


