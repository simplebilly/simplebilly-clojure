(ns simple-billy-api.specs.group-figure-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def group-figure-create-data
  {
   (ds/opt :bilanzsumme) string?
   (ds/opt :exemptionClaimed) boolean?
   (ds/opt :mitarbeiter) int?
   (ds/opt :nettoUmsatz) string?
   (ds/opt :parentName) string?
   (ds/opt :parentSitus) string?
   })

(def group-figure-create-spec
  (ds/spec
    {:name ::group-figure-create
     :spec group-figure-create-data}))
