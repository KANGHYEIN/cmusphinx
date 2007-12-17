#!/bin/sh

expt=$1
if [ x"$expt" = x ]; then
    >&2 echo "Usage: $0 EXPTID [DECODER]"
    exit 1
fi
decode=${2:-../src/programs/pocketsphinx_batch}

$decode \
    -hmm ../model/hmm/wsj1 \
    -dict bcb05cnp.dic \
    -lm bcb05cnp.z.DMP \
    -lw 7.5 -wip 0.5 \
    -beam 1e-60 -wbeam 1e-40 -bestpathlw 11.5 \
    -cepdir . -cepext .mfc8 \
    -ctl wsj_test.fileids \
    -hyp $expt.hyp \
    -latsize 50000 \
    > $expt.log 2>&1

./word_align.pl wsj_test.transcription $expt.hyp > $expt.align

grep -h ': AVERAGE' $expt.log
tail -n3 $expt.align