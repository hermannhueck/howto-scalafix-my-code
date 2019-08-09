#!/bin/sh

set -x

scalafix \
    --check \
    --stdout \
    --scalac-options -Yrangepos \
    --scalac-options -Ywarn-unused \
    --auto-classpath \
    --files src/main/scala/tofix/HelloApp.scala \
    --rules RemoveUnused ProcedureSyntax
