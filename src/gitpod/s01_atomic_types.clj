(ns gitpod.ex01-basics)

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
;; but this has special properties in Clojure #Verify
:A

;; Ratio /  clojure.lang.Ratio
;; Any fraction that doesn't evaluated to a integer will be maintained as Ratios
12/7

;; Boolean / java.lang.Boolean
true
false

;; nil
;; Equivalent of null in Java
nil

;; There are some more , but we'll get there once you are ready.