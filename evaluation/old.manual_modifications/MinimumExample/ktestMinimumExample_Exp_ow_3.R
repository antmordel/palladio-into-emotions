print("MinimumExample with Exponentials and OpenWorkload = 3")

minimumPCM = read.csv2("PalladioResults/MinimumExample_Exp_3_16000.csv", header=F, dec=".")
minimumEmotions = read.csv2("MaudeResults/result_16000tu_ow_3_exp.txt", header=F, dec=".")
ks.test(minimumPCM[,1], minimumEmotions[,1])

png('outME_Exp_ow_3.png')
plot(ecdf(minimumPCM[,1]), main="", xlab="", ylab="")
par(new=TRUE)
plot(ecdf(minimumEmotions[,1]), main="", xlab="", ylab="", col="blue")
title(main="MinimumExample", sub="e-Motions in blue",
	xlab="ResponseTime", ylab="CDF")


