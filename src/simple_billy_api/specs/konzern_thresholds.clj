(ns simple-billy-api.specs.konzern-thresholds
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def konzern-thresholds-data
  {
   (ds/req :bilanzsumme) string?
   (ds/req :mitarbeiter) int?
   (ds/req :netto_umsatz) string?
   })

(def konzern-thresholds-spec
  (ds/spec
    {:name ::konzern-thresholds
     :spec konzern-thresholds-data}))
