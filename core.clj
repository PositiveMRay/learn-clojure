(ns learn-clojure.core
  (:gen-class))

(defn make-a-vector
  "Just make a vector out of some values"
  []
  ;;The same as [true 3 "four" 5]
  (vector true 3 "four" 5))

(defn replace-several
  "Replace several character sequences within
  a string with their substitutes using matching"
  [s & {:as replacements}]
  (reduce (fn [s [match replacement]]
    (clojure.string/replace s match replacement))
    s replacements))

(defn -main
  "Just learning some clojure basics"
  [& args]
  (let [my-vector [1 2 3 4]]
    (println my-vector))
  (println "Calling make-a-vector and, then, printing the result...")
  (println (make-a-vector))
  (let [novels (vector "Emma" "Coma" "War and Peace")]
    (println (str "There are " (count novels) " novels in the vector called \"novels\"."))
    (println (str "The first novel is \"" (first novels) "\".")))
  (println (str "Let's go to: " (replace-several "http://www.shop.com/$seller/items/$item-code/prices/$currency"
                    "$seller" "bob"
                    "$item-code" "A507"
                    "$currency" "USD") "!"))
  (println "Done!"))
