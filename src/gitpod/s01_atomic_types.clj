(ns gitpod.s01-atomic-types
  (:use clojure.repl))

;; Below are some of main atomic data-types worth knowing
;; Everything that we have in clojure are Java objects. 
;; Ofcourse in someplaces the Java primitives will be used.
;; Clojure operates in mixed mode of using Java's primitive/objects, based on the context.

;; long / java.lang.Long
1

;;char / java.lang.Character
\A

;; String / java.lang.String
"Clojure"

;; Regex / java.util.regex.Pattern
;; # included as part of the literal
#"c.*e"

;; Keyword / clojure.lang.Keyword
;; To start with consider this something like a string, 
;; but this has special properties in Clojure
:some-key

;; Ratio /  clojure.lang.Ratio
;; Any fraction that doesn't evaluated to a integer will be maintained as Ratios
;; This avoids losing precision by rounding-off the decimals.
22/7

22/2

;; boolean / java.lang.Boolean
true
false

;; nil
;; Equivalent of null in Java/Javascript, None in Python
nil

;; There are some more , but we'll get there once you are comfortable.

;; Though we showcase by evaluating. Clojure is compile language.
;; The expressions are dynimcally compile to Java classes, using
;; ASM Library and the classes are executed.