DESCRIPTION = "TinyALSA is a small library to interface with ALSA in \
the Linux kernel. It is a lightweight alternative to libasound."
HOMEPAGE = "https://github.com/tinyalsa/tinyalsa"
SECTION = "libs/multimedia"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://NOTICE;md5=e04cd6fa58488e016f7fb648ebea1db4"

SRCREV = "1c5fb68ced57d838f2b7ecd0c00bc1fefc9ab60d"
SRC_URI = "git://github.com/tinyalsa/tinyalsa;branch=master;protocol=https \
	   	    file://0001-fixed-compilation-error-caused-by-strncpy.patch \
          "

S = "${WORKDIR}/git"

inherit cmake

# tinyalsa is built as a static library. Enable PIC to avoid relocation
# errors like these:
#
#    unresolvable R_AARCH64_ADR_PREL_PG_HI21 relocation against symbol `stderr@@GLIBC_2.17'
CFLAGS += " -fPIC -DPIC "
