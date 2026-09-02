(ns simple-billy-api.specs.group-figure
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def group-figure-data
  {
   (ds/opt :bilanzsumme) string?
   (ds/opt :exemptionClaimed) boolean?
   (ds/opt :mitarbeiter) int?
   (ds/opt :nettoUmsatz) string?
   (ds/opt :parentName) string?
   (ds/opt :parentSitus) string?
   (ds/req :year) int?
   })

(def group-figure-spec
  (ds/spec
    {:name ::group-figure
     :spec group-figure-data}))
