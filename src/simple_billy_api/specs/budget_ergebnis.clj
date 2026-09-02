(ns simple-billy-api.specs.budget-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.budget-kategorie :refer :all]
            [simple-billy-api.specs.budget-kategorie :refer :all]
            )
  (:import (java.io File)))


(def budget-ergebnis-data
  {
   (ds/req :jahr) int?
   (ds/req :monat) int?
   (ds/req :monats_budget) (s/coll-of budget-kategorie-spec)
   (ds/req :prognose_restjahr) (s/coll-of budget-kategorie-spec)
   })

(def budget-ergebnis-spec
  (ds/spec
    {:name ::budget-ergebnis
     :spec budget-ergebnis-data}))
