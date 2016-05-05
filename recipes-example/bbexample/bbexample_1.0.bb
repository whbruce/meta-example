#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

SRCREV = "c035aeb59ee9544ce223c6bde0af68fb3aa5da97"
SRC_URI = "git://github.com/whbruce/bbexample.git"

S = "${WORKDIR}/git"

inherit autotools

