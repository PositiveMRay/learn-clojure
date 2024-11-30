(defn replace-several
  "Replace several character sequences within
  a string with their substitutes using matching"
  [s & {:as replacements}]
  (reduce (fn [s [match replacement]]
    (clojure.string/replace s match replacement))
    s replacements))

;; usages
(replace-several "http://www.shop.com/$seller/items/$item-code/prices/$currency"
                    "$seller" "bob"
                    "$item-code" "A507"
                    "$currency" "USD")