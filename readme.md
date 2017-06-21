# Artificial Intelligence Algorithms

K-Nearest-Neighbor Algorithms

Learning: Store everything of the training set (a vector with a label)

Classify new vector:

1. For every learned vector: Calculate distance
2. Sort list of distances
3. Take first 3 items and classify as the label that was most often there. If there are 3 different labels, take one of them at random.


Pseudocode - https://stackoverflow.com/questions/22796864/k-nearest-neighbor-pseudocode
	
kNN (dataset, sample){
1. Go through each item in my dataset, and calculate the "distance" from that data item to my specific sample.
2. Classify the sample as the majority class between K samples in the dataset having minimum distance to the sample.
}

Java Implementation - http://afewguyscoding.com/2010/05/nearest-neighbors-java/