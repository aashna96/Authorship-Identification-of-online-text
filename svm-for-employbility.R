library(ROAuth)
library(plyr)
library(dplyr)
library(stringr)
library(ggplot2)
library(httr)
library(wordcloud)
library(sentimentr)
library(SnowballC)
library(tm)
library(RColorBrewer)
em <- read.csv("C:/Users/kainth/Desktop/em.csv")
head(em)


x <- matrix(rnorm(20*2), ncol=2)
y <- c(rep(-1,10), rep(1,10))
x[y==1,]=x[y==1,] + 1

plot(x, col=(3-y))
dat <- data.frame(x=x, y=as.factor(y))
svm.fit <- svm(y ~., data=dat, kernel='linear', cost=10, scale=FALSE)
# Plot the SVC obtained
plot(svm.fit, dat)



plot(em$paragraph_no., em$employed)
plot(em$paragraph_no., em$employed, type = "l", col = "red", lwd = 3)    
