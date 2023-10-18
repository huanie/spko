module.exports = grammar({
  name: "Clock",
  extras: ($) => [/\s|\\\r?\n/],
  rules: {
    clock: ($) => choice($._word, $._time),
    _word: (_) =>
      choice("Midnight", "Noon", seq("12", choice("midnight", "noon"))),
    _time: ($) => seq($._hour, ":", $._minute, " ", $._format),
    _hour: (_) => choice(/[1-9]/, /1[0-2]/, "12"), // need literal 12 because regex does not seem to have precedence
    _minute: (_) => choice(/[0-9]/, /[0-5][0-9]/),
    _format: (_) => choice("a.m.", "p.m."),
  },
});
