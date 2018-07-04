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
trust <- read.csv("C:/Users/kainth/Desktop/trust.csv")
print(trust)
class_category = classify_text(sometext, algorithm="bayes", prior=1.0)

set=class_category[,7]

#set[is.na(set)]="unknown"

class_pol= classify_polarity(sometext,algorithm="bayes")

polarity=class_pol[,4]


table(trust)
pie(table(trust$trust),col = brewer.pal(7,"Set1"))

#
##
# bar graph #
counts <- table(trust$trust)
barplot(counts, main="classification based on trustworthiness",
        xlab="trust factors",ylab = "factor_expressed") 


## coloured bar graph ##

df <- data.frame(trust_factors=c("Credibility", "Reliability", "Intimacy","Self-Orientation"),
                 factor_expressed=c(500,300,150,50))
head(df)
p<-ggplot(df, aes(x=trust_factors, y=factor_expressed, fill=trust_factors)) +
  geom_bar(stat="identity")+theme_minimal()
p









