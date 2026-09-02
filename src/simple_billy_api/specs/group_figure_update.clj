(ns simple-billy-api.specs.group-figure-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def group-figure-update-data
  {
   (ds/opt :bilanzsumme) string?
   (ds/opt :exemptionClaimed) boolean?
   (ds/opt :mitarbeiter) int?
   (ds/opt :nettoUmsatz) string?
   (ds/opt :parentName) string?
   (ds/opt :parentSitus) string?
   })

(def group-figure-update-spec
  (ds/spec
    {:name ::group-figure-update
     :spec group-figure-update-data}))
