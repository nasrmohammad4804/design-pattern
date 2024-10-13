template pattern

idea behind that . 
when we have common classes that want to do task. 
task include many step . and each step is may different or not

for example consider overall task with 2 different type. 
such as transferMoney and generateReport

for the whole task we have 2 step shared among that. record trail and execute

execute is different for each task but trail is common. 
is better to design base class with method named complete() and do trail and execute() abstract method.


    The Template Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class,
    allowing subclasses to override specific steps without changing the overall structure.
    This promotes code reuse and flexibility while maintaining a consistent workflow.

Benefits:

    Code Reusability: Common functionality is centralized in the abstract class.
    Flexibility: Subclasses can customize specific parts of the algorithm.
    Maintainability: Changes to the common workflow are made in one place.

step-by-step approach:

example PDFDocumentProcessor,WordDocumentProcessor

1. Identify Repetitive Algorithms Look for similar methods across different classes <br/>
   that implement the same algorithm but with variations. <br/><br/>

2. Analyze Common Structure Determine the shared steps in the processing logic. <br/>
   For instance, each document might need to: <br/>

<ul>
    <li>Read the document</li>
    <li>Process the content</li>
    <li>Save the results</li>
</ul>

3. Define the Abstract Class Create an abstract class that outlines the common algorithm.


        abstract class DocumentProceesor{
            //template method
            
            public final void processDocument() {
                readDocument();
                processContent();
                saveResults();
            }
            protected abstract void readDocument();
            protected abstract void processContent();
            protected abstract void saveResults();
       }
   1. create concrete classes
   

           class PDFDocumentProcessor extends DocumentProcessor {
        
               @Override
               protected void readDocument() {
                   System.out.println("Reading PDF document.");
               }

               @Override
               protected void processContent() {
                   System.out.println("Processing PDF content.");
               }

               @Override
               protected void saveResults() {
                   System.out.println("Saving results from PDF processing.");
               }
         }

         class WordDocumentProcessor extends DocumentProcessor {
         
             @Override
             protected void readDocument() {
                 System.out.println("Reading Word document.");
             }

            @Override
            protected void processContent() {
                System.out.println("Processing Word content.");
            }

            @Override
            protected void saveResults() {
                System.out.println("Saving results from Word processing.");
            }
        }

> Summary
In this example, you started with multiple classes implementing similar processing logic 
> and refactored them into a single abstract class with a template method. Each subclass 
> provides the specifics for its document type while reusing the overall algorithm structure,
> promoting cleaner and more maintainable code.
