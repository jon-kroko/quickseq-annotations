# quickseq-annotations
 
This repo contains the annotations `@SequenceDiagram` and `@SequenceDiagramEntryPoint`. They are needed by the [QuickSeq Kotlin Compiler Plugin](https://github.com/Kira-We/quickseq) in order to generate UML sequence diagrams from your Kotlin code. 

#### Why do the annotations come in an extra library?

You probably do not want to generate sequence diagrams every time you run your tests, because the diagramming takes its time. Hence you want to apply the QuickSeq plugin conditionally, but your project should still be able to resolve the annotations in your code.
