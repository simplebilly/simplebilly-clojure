(ns simple-billy-api.specs.email-template-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def email-template-status-data
  {
   })

(def email-template-status-spec
  (ds/spec
    {:name ::email-template-status
     :spec email-template-status-data}))
