(ns simple-billy-api.specs.account-overview
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def account-overview-data
  {
   (ds/req :account) string?
   (ds/req :account_name) string?
   (ds/req :balance) string?
   (ds/req :credit_total) string?
   (ds/req :debit_total) string?
   })

(def account-overview-spec
  (ds/spec
    {:name ::account-overview
     :spec account-overview-data}))
