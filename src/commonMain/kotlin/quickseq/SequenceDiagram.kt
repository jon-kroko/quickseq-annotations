package com.kiwi.quickseq

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class SequenceDiagram(val returnSilently: Boolean = false)
