(ns simple-billy-api.specs.eks-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.eks-monats-wert :refer :all]
            )
  (:import (java.io File)))


(def eks-ergebnis-data
  {
   (ds/req :gesamtergebnis) string?
   (ds/req :monate) (s/coll-of eks-monats-wert-spec)
   (ds/req :prognose_naechste_6_monate) string?
   (ds/req :summe_ausgaben) string?
   (ds/req :summe_einnahmen) string?
   (ds/req :zeitraum_bis) string?
   (ds/req :zeitraum_von) string?
   })

(def eks-ergebnis-spec
  (ds/spec
    {:name ::eks-ergebnis
     :spec eks-ergebnis-data}))
