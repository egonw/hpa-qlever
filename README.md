# QLever files for the Human Protein Atlas Nanopublications

This repository contains the `Qleverfile` to start a local [QLever](https://github.com/ad-freiburg/qlever/) server.

The data is CC-BY and comes from https://www.proteinatlas.org/about/download

The https://www.proteinatlas.org/download/proteinatlas.trig.gz file can be gunziped and then converted
with the Groovy script in this repository.

## Creating and starting

The following instructions are for a Debian GNU/Linux system that uses `venv`.

First, install `pipx` and `qlever`:

```shell
sudo apt install pipx
pipx install qlever
```

Then the data can be downloaded and indexed:

```
qlever get-data
qlever index
qlever start
qlever ui
```

