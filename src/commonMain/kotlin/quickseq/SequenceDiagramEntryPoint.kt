package com.kiwi.quickseq

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class SequenceDiagramEntryPoint(val title: String = "")
