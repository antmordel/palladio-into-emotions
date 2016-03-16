# e-Motions reimplementation of Palladio

This project aims to give a rule-based explicit behavior of the Palladio
Component Model (PCM). 

What is this project?
---------------------

[e-Motions](http://atenea.lcc.uma.es/index.php/Main_Page/Resources/E-motions) is
a framework in which you can define whatever Domain-Specific Language (DSL) you
desire. Such a DSL will be defined by giving its syntax (abstract and concrete)
and its behavior. The abstract syntax is specified by means of a EMF metamodel;
and its concrete syntax by associating an image to every concept in the
language. The behavior is given by a set of visual graph transformation rules,
with a left-hand side (LHS), with positive conditions, a right-hand side (RHS)
and none or more negative application conditions (NACs). Rules are annotated
with time requirements and each rule defines an action.

Since [Palladio](https://sdqweb.ipd.kit.edu/wiki/Palladio_Component_Model) is a
DSL, and e-Motions is a framework where we can define any DSL, here we give a
definition of Palladio within e-Motions.

Non-Functional Properties
-------------------------

Using previous works about composition of DSLs, we aim to compose the Palladio's
specification in e-Motions with a bunch of Non-Functional Properties (NFPs).
This process of weaving new NFPs will be perform in a automatic and conservative way.
By conservative we mean that the specified behavior will not change after adding
the NFP at hand.
