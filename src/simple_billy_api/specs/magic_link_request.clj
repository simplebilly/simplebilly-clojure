(ns simple-billy-api.specs.magic-link-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def magic-link-request-data
  {
   (ds/req :email) string?
   })

(def magic-link-request-spec
  (ds/spec
    {:name ::magic-link-request
     :spec magic-link-request-data}))
