Projects Tutorial
==========
@author Wesley Egberto

@date 2015

Repository to some Java tutorials



## Primefaces + Bootstrap ##
A way to use Primefaces and Bootstrap in your projects. Just use the Primefaces' components with Bootstrap's CSS classes, in this way the components will become more responsive.
Some components (like selectOneMenu, spinner, inputNumeric, calendar, splitbutton, autocomplete with dropdown button) needs an extra edition in its style to become responsive. The file /PrimefacesBootstrap/src/main/webapp/resources/css/style.css contains some classes which I edited.

Example of text box and button:

```
<p:inputText styleClass="form-control" placeholder="Enter the name:" />

<p:commandButton styleClass="btn btn-primary" value="Primefaces CommandButton + btn-primary" />
```

