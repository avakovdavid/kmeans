#!/bin/bash

echo Compiling kmeans ... 
scalac -d classes *.scala

if [ $# = 2 ]; then 
	echo Running kmeans ... 
	scala -cp classes KMeans $1 $2
else 
	echo "Aborting. You need to specify 2 arguments : [data file] and [K: number of clusters]"
fi
