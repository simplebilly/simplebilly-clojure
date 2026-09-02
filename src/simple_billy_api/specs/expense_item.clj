(ns simple-billy-api.specs.expense-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def expense-item-data
  {
   (ds/req :amount) string?
   (ds/req :category) string?
   (ds/req :percentage) float?
   })

(def expense-item-spec
  (ds/spec
    {:name ::expense-item
     :spec expense-item-data}))
