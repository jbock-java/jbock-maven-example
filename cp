#!/usr/bin/env bash
java --module-path $(./get_module_path) --module jbock.maven.example/net.jbock.cp.CopyFile $@
