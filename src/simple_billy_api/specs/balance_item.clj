(ns simple-billy-api.specs.balance-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def balance-item-data
  {
   (ds/req :account) string?
   (ds/req :account_name) string?
   (ds/req :amount) string?
   })

(def balance-item-spec
  (ds/spec
    {:name ::balance-item
     :spec balance-item-data}))
