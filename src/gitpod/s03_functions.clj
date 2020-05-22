(ns gitpod.s03-functions
  (:use clojure.repl))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Syntax
(defn
  function-name
  [params]
  ;; function body
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;Creating your first function
(defn ;; Operator to define a function

  welcome ;; Function name

  [] ;; Parameters

  (println "Welcome to the Clojure world!!!")) ;; Function body

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Calling the defined function
(welcome)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; There are no explicit returns in the clojure functions.
;; For example this returns 1
(defn
  welcome
  []
  (println "Welcome to the Clojure world!!!")
  1)

;; Function with parameter
(defn
  welcome-name
  [name]
  (println "Hello" name "!" "Welcome to the Clojure world!!!"))

(welcome-name "programmers")