package com.work.utils.ucdetect;

import java.io.File;
import java.util.Queue;
import java.util.concurrent.ConcurrentSkipListSet;

public abstract class ThreadDataQueue {

	static Queue<File> fileQueue;
	static ConcurrentSkipListSet<String> methodNameSet;
	
}
