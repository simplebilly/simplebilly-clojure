(ns simple-billy-api.specs.eks-monats-wert
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def eks-monats-wert-data
  {
   (ds/req :ausgaben) string?
   (ds/req :einnahmen) string?
   (ds/req :ergebnis) string?
   (ds/req :monat) string?
   })

(def eks-monats-wert-spec
  (ds/spec
    {:name ::eks-monats-wert
     :spec eks-monats-wert-data}))
