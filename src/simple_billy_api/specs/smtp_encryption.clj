(ns simple-billy-api.specs.smtp-encryption
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def smtp-encryption-data
  {
   })

(def smtp-encryption-spec
  (ds/spec
    {:name ::smtp-encryption
     :spec smtp-encryption-data}))
