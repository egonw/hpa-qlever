# QLever files for the Open SbD4Nano Semantic Landscape data

This repository contains the `Qleverfile` to start a local [QLever](https://github.com/ad-freiburg/qlever/) server.
It automatically loads the data from [this SbD4Nano repository](https://github.com/h2020-sbd4nano/sbd-data-landscape-opendata/blob/main/open.ttl).

## Creating and starting

The following instructions are for a Debian GNU/Linux system that uses `venv`.

First, install `pipx` and `qlever`:

```shell
sudo apt install pipx
pipx install qlever
```

Then the data can be downloaded and indexed:

```
~/.local/bin/qlever get-data
~/.local/bin/qlever index
```

