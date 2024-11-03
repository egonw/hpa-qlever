@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.4-SNAPSHOT')
@Grab(group='io.github.egonw.bacting', module='managers-rdf', version='1.0.4-SNAPSHOT')
@Grab(group='io.github.egonw.bacting', module='net.bioclipse.managers.wikidata', version='1.0.4-SNAPSHOT')

workspaceRoot = ".."
rdf = new net.bioclipse.managers.RDFManager(workspaceRoot);

store = rdf.createStore("/tmp/tmpStore")
rdf.importFile(store, "/hpa-qlever/proteinatlas.trig", "TRIG")
println store.toString()

println "Number of triples: " + rdf.size(store)

rdf.saveRDF(store, "/hpa-qlever/proteinatlas.ttl", "TURTLE")
