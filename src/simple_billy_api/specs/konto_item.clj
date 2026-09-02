(ns simple-billy-api.specs.konto-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def konto-item-data
  {
   (ds/req :anfangsbestand) string?
   (ds/req :haben_umsatz) string?
   (ds/req :konto) string?
   (ds/req :name) string?
   (ds/req :saldo) string?
   (ds/req :soll_umsatz) string?
   })

(def konto-item-spec
  (ds/spec
    {:name ::konto-item
     :spec konto-item-data}))
