(ns simple-billy-api.specs.pn-l-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pn-l-item-data
  {
   (ds/req :account) string?
   (ds/req :account_name) string?
   (ds/req :amount) string?
   })

(def pn-l-item-spec
  (ds/spec
    {:name ::pn-l-item
     :spec pn-l-item-data}))
