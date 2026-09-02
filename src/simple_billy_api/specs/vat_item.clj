(ns simple-billy-api.specs.vat-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vat-item-data
  {
   (ds/req :net_amount) string?
   (ds/req :tax_amount) string?
   (ds/req :tax_rate) string?
   })

(def vat-item-spec
  (ds/spec
    {:name ::vat-item
     :spec vat-item-data}))
