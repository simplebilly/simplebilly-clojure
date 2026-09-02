(ns simple-billy-api.specs.magic-link-verify-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def magic-link-verify-request-data
  {
   (ds/req :token) string?
   })

(def magic-link-verify-request-spec
  (ds/spec
    {:name ::magic-link-verify-request
     :spec magic-link-verify-request-data}))
