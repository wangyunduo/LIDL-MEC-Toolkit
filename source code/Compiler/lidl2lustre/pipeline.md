### Transformation Pipeline

Labelling
- RelabelGraphNode (Optional)

Unpacking

- CheckPackageImport 
- CollapseModule 

Extraction of Main nodes

* Switching the root node from programRoot to the Main Interaction specified by user

- ResolveMainInteraction

We now probably get a similar structure as js implementation by Vincent, who proposed LIDL.