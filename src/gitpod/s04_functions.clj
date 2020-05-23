(ns gitpod.s03-functions
  (:use clojure.repl))


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
;; NOTICE: the parathesis around the function name.
;; Which was not there in the earlier examples.
;; 
;; You add parantesis around an expression that you have to evaluate.

;; Fo ex.

welcome ;; This just returns the function that you created
(welcome) ;; This executes the the function

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; There are no explicit returns in the clojure functions.
;; For example this returns 1
(defn
  welcome
  []
  (println "Welcome to the Clojure world!!!")
  (count "Welcome to the Clojure world!!!"))

;; See the value of count being returned
(welcome)

;; Function with arity
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn
  welcome-name
  [name]
  (println "Hello" name "!" "Welcome to the Clojure world!!!"))

(welcome-name "programmers")